package unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Very First Unit Test! Let's go...")
class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount("Derrick", "Park", 1000.0, BankAccount.CHECKING);
    }

    @ParameterizedTest
    @ValueSource(doubles = {100, 200, 10.5, -10.5, 1234.5, 0})
    void deposit(double amount) {
        double balance = account.deposit(amount);
        assertEquals(balance - 1000.00, amount, 0.001, "🤬");
    }

    @ParameterizedTest
    @ValueSource(doubles = {600.0, 0.0, -500.0, 100.12, -12.12})
    void withdrawBranch(double amount) {
        double balance = account.withdraw(amount, true);
        assertEquals(1000.00 - balance, amount, 0.001);
    }

    @Test
    void withdrawNotBranch() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(600.0, false);
        });
    }

    @AfterEach
    void teardown() {
        account = null;
    }
}
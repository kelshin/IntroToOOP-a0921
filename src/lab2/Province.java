package lab2;

public class Province {
    private static final long DEFAULT_POPULATION = 4_648_055;
    private static final String DEFAULT_PROVINCE = "British Colombia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    public static final String[] PROVINCES = {
            "Ontario",
            "Quebec",
            "British Columbia",
            "Alberta",
            "Manitoba",
            "Saskatchewan",
            "Nova Scotia",
            "New Brunswick",
            "Newfoundland and Labrador",
            "Prince Edward Island"
    };
    private static final String[] CAPITALS = {
            "Edmonton",
            "Victoria",
            "Winnipeg",
            "Fredericton",
            "St. John's",
            "Halifax",
            "Toronto",
            "Charlottetown",
            "Quebec City",
            "Regina"
    };
    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name))
                && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.name = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    private boolean isValidPopulation(long population) {
        if (population >= 30_000 && population <= 15_000_000) {
            return true;
        }
        return false;
    }

    private boolean isValidProvince(String name) {
        for (String province : PROVINCES) {
            if (province.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        for (String cap : CAPITALS) {
            if (capital.equals(cap)) {
                return true;
            }
        }
        return false;
    }

    public String getDetails() {
        return "The capital of " + this.name +
                " (population. " + this.population + ") "
                + "is " + this.capital + ".";
    }
}

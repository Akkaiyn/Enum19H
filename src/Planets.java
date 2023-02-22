public enum Planets {
    MERCURY("The closest planet to Sun"),
    VENUS("Yellow planet"),
    EARTH("Our favorite planet, where we live"),
    MARS("The planet, where Elon Musk wants to move the earth to"),
    JUPITER("The biggest planet in solar system"),
    SATURN("The extraordinary planet"),
    URANUS("Light blue planet"),
    NEPTUNE("The most far planet from Sun");

    private String description;

    Planets(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "description='" + description + '\'' +
                '}';
    }
}

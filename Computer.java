/**
 * Computer PC box spec class
 * too many parameters to pass to constructor so we using
 * embedded builder class
 */

public class Computer {

    // Must have in computer
    final private String CPU;
    final private String motherBoard;
    final private String RAM;
    // Optional
    final private String HDD;
    final private String DVD;

    // Helps to build new computer
    public static class Builder {
        final private String CPU;
        final private String motherBoard;
        private String RAM;
        private String HDD;
        private String DVD;

        //  Prepare must have options
        public Builder(String CPU, String motherBoard, String RAM) {
            this.CPU = CPU;
            this.motherBoard = motherBoard;
            this.RAM = RAM;
        }

        /** Set optionals **/

        public Builder HDD (String val) {
            HDD = val;
            return this;
        }

        public Builder DVD (String val) {
            DVD = val;
            return this;
        }

        public Builder RAM (String val) {
            RAM = val;
            return this;
        }

        // Final build
        public Computer build() {
            return new Computer(this);
        }

    }

    // Constructs computer by builder
    private Computer(Builder builder) {
        CPU = builder.CPU;
        motherBoard = builder.motherBoard;
        HDD = builder.HDD;
        DVD = builder.DVD;
        RAM = builder.RAM;
    }

}

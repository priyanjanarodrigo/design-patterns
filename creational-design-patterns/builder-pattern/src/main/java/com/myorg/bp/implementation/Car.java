package com.myorg.bp.implementation;

public class Car {
    private final String insurance;
    private final Boolean etc;
    private final String roadAssistance;
    private final String dropOffLocation;

    /**
     * Step 3 - (Please refer Step 1 and 2 before considering this).
     * This will set Builder static class property values to relevant Car object properties.
     */
    public Car(Builder builder) {
        this.insurance = builder.insurance;
        this.etc = builder.etc;
        this.roadAssistance = builder.roadAssistance;
        this.dropOffLocation = builder.dropOffLocation;
    }

    // Step 1 - Create a static inner class as Builder with required parameters of parent class
    public static class Builder {
        private String insurance;
        private Boolean etc;
        private String roadAssistance;
        private String dropOffLocation;

        /**
         * If we want ot enforce some properties which are mandatory for object creation, in that case we can enforce
         * them that with a parameterized constructor. if not we can just create/ have the default constructor
         *
         * In this case consider insurance property is mandatory and must be enforced. We can do it by creating a
         * parameterized constructor as follows
         */
        public Builder(String insurance) {
            this.insurance = insurance;
        }

        /**
         * Here, what we are going to do is, we're going to create four different methods (for each parameter/ property
         * available) and each method will set the relevant parameter and return the current instance.
         *
         * Most of the time the method name may take the similar name of the property.
         *
         * This type of method may look like a constructor or may be like a setter, but it's not. it's just a method
         * which sets the corresponding parameter and returns the current instance.
         */
        public Builder etc(Boolean etc) {
            this.etc = etc;
            return this;
        }

        public Builder roadAssistance(String roadAssistance) {
            this.roadAssistance = roadAssistance;
            return this;
        }

        public Builder dropOffLocation(String dropOffLocation) {
            this.dropOffLocation = dropOffLocation;
            return this;
        }

        // Step 2 - Create a method called build()
        public Car build() {
            // Refer Step 3 for this constructor creation in parent class Car which takes Builder as the argument
            return new Car(this);
        }
    }// End of static inner class Builder

    @Override
    public String toString() {
        return "Car{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                '}';
    }
}

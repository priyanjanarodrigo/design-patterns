package com.myorg.bp.telescopic;

public class CarTelescopic1 {
    String insurance;
    Boolean etc;
    String roadAssistance;
    String dropOffLocation;

    // Constructor 1
    CarTelescopic1(String insurance) {
        this.insurance = insurance;
    }

    // Constructor 2
    CarTelescopic1(String insurance, Boolean etc) {
        /** Calls Constructor 1 to pass insurance parameter.
         * Sets etc value within current constructor.
         * Current constructor internally calls Constructor 1
         * [ Constructor 2 -> Constructor 1]
         * */
        this(insurance);
        this.etc = etc;
    }

    // Constructor 3
    CarTelescopic1(String insurance, Boolean etc, String roadAssistance) {
        /** Calls constructor 2 to pass insurance and etc parameters.
         * Sets roadAssistance value within current constructor.
         * Current constructor internally calls Constructor 2 and Constructor 2 internally calls Constructor 1
         * [ Constructor 3 -> Constructor 2 -> Constructor 1]
         * */
        this(insurance, etc);
        this.roadAssistance = roadAssistance;
    }

    // Constructor 4
    public CarTelescopic1(String insurance, Boolean etc, String roadAssistance, String dropOffLocation) {
        /** Calls constructor 3 to pass insurance, etc and roadAssistance parameters.
         * Sets dropOffLocation value within current constructor.
         * Current constructor internally calls Constructor 3 , Constructor 3 internally calls Constructor 2 and
         * Constructor 2 internally calls Constructor 1
         * [ Constructor 4 -> Constructor 3 -> Constructor 2 -> Constructor 1]
         * */
        this(insurance, etc, roadAssistance);
        this.dropOffLocation = dropOffLocation;
    }

    @Override
    public String toString() {
        return "CarTelescopic1{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                '}';
    }
}

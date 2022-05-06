package com.myorg.bp.telescopic;

public class CarTelescopic2 {
    String insurance;
    Boolean etc;
    String roadAssistance;
    String dropOffLocation;

    public CarTelescopic2(String insurance, Boolean etc, String roadAssistance, String dropOffLocation) {
        this.insurance = insurance;
        this.etc = etc;
        this.roadAssistance = roadAssistance;
        this.dropOffLocation = dropOffLocation;
    }

    public CarTelescopic2(String insurance, Boolean etc, String roadAssistance) {
        /** Calls all-args constructor and sets roadAssistance as null due to roadAssistance parameter is not
         * passed to the current constructor */
        this(insurance, etc, roadAssistance, null);
    }

    public CarTelescopic2(String insurance, Boolean etc) {
        /** Calls all-args constructor and sets both roadAssistance and dropOffLocation as null due to roadAssistance
         * and dropOffLocation parameters are not passed to the current constructor */
        this(insurance, etc, null, null);
    }

    public CarTelescopic2(String insurance) {
        /** Calls all-args constructor and sets etc, roadAssistance and dropOffLocation as null due to roadAssistance
         * etc and dropOffLocation parameters are not passed to the current constructor */
        this(insurance, null, null, null);
    }

    @Override
    public String toString() {
        return "CarTelescopic2{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                '}';
    }
}

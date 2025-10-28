package org.lolzdev.steelworks.vehicles;

public enum VehicleDirection {
    FORWARD,
    BACKWARDS;

    public VehicleDirection getOpposite() {
        return this == FORWARD ? BACKWARDS : FORWARD;
    }
}

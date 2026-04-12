package wk13;

public interface License {
    boolean licenceIsSuspended();
    boolean canDriveVehicle(String vehicleType);
    String getLicenceType();


    boolean isLicenseSuspended();
}

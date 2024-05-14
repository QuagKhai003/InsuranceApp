module java {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires org.eclipse.persistence.jpa;

    opens com.insurancesurveyor to javafx.fxml;
    exports com.insurancesurveyor;
    exports InsuranceClaims;
    exports InsuranceCustomer;
    exports InsuranceEmployee;
    exports Database;
}
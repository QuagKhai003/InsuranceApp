package InsuranceClaims;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class ClaimListView {
    @FXML
    private TableColumn<Claim, String> fID;

    @FXML
    private TableColumn<Claim, String> insured_person;

    @FXML
    private TableColumn<Claim, String> card_number;

    @FXML
    private TableColumn<Claim, String> claim_date;

    @FXML
    private TableColumn<Claim, String> exam_date;

}

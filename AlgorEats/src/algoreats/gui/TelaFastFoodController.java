package algoreats.gui;
import algoreats.negocio.beans.EnumFastFood;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class TelaFastFoodController {

    @FXML private TableView<EnumFastFood> tbvPratos;
    @FXML private Button btCancela;
    @FXML private Button btPedido;
    
    public void initialize() {

    }

    @FXML
    void onClickCancela(ActionEvent event) {
    	((Stage) this.btCancela.getScene().getWindow()).close();
    }
    
 

    @FXML
    void onClickPedido(ActionEvent event) {

    }
}

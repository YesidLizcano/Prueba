package Controllers;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class UsuarioController {
	ArrayList<Usuario> usuarios = new ArrayList<>();
	@FXML
	private TextField user, password;
	
	private String User, Password;
	@FXML
	public void handleLogin() {
		usuarios.add(new Usuario("admin", "admin123"));
		usuarios.add(new Usuario("usuario1", "pass1234"));
		usuarios.add(new Usuario("juanperez", "juan2024"));
		usuarios.add(new Usuario("maria98", "maria456"));
		usuarios.add(new Usuario("sofia23", "sofia789"));
		User = user.getText();
		Password = password.getText();
		if (User.isBlank() || Password.isBlank()) {
			this.AlertWindow("Debe llenar todos los datos presentados.", AlertType.ERROR);
			return;
		}
		private int number = 0;
		while (true) {
			private Usuario user1 = new Usuario(usuarios(number).n;
		}
		
		
	}

	private void AlertWindow(String text, AlertType type) {
		Alert alert = new Alert(type);
        alert.setTitle(null);
        alert.setHeaderText(text);
        alert.setContentText(null);
        alert.showAndWait();
	}
	
}

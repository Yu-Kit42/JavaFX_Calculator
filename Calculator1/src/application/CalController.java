package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;




public class CalController implements Initializable {
	@FXML Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	@FXML Button btnCL, btnPL, btnMI, btnMU, btnDL, btnEQ;
	@FXML Label lblIR, lblID; 
	
	
	String num = "";
	String op;
	int n, x, y, result;
	
	
	private CalModel model = new CalModel() ;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		
		
	}
	public void btn0Action(ActionEvent evnet) {
		n=0;
		makenum(n);
		
	}
	
	public void btn1Action(ActionEvent evnet) {
		n=1;
		makenum(n);
		
	}
	public void btn2Action(ActionEvent evnet) {
		n=2;
		makenum(n);
		
	}
	public void btn3Action(ActionEvent evnet) {
		n=3;
		makenum(n);
		
	}
	public void btn4Action(ActionEvent evnet) {
		n=4;
		makenum(n);
		
	}
	public void btn5Action(ActionEvent evnet) {
		n=5;
		makenum(n);
		
	}
	public void btn6Action(ActionEvent evnet) {
		n=6;
		makenum(n);
		
	}
	public void btn7Action(ActionEvent evnet) {
		n=7;
		makenum(n);
		
	}
	public void btn8Action(ActionEvent evnet) {
		n=8;
		makenum(n);
		
	}
	public void btn9Action(ActionEvent evnet) {
		n=9;
		makenum(n);
		
	}
	public void btnCLAction(ActionEvent evnet) {
		 lblIR.setText("");
		 lblID.setText("");
			
	}
	public void btnEQAction(ActionEvent evnet) {
		y= Integer.parseInt(lblIR.getText());				
		num = lblID.getText();
		
		lblID.setText(num + y + " = ");
		result = model.calculate(op, x, y);	
		lblIR.setText(Integer.toString(result));
		
		num = lblID.getText();
		lblID.setText(num+result);
	}
	public void btnDLAction(ActionEvent evnet) {
		op = "/";
		makelog(op);
	}
	public void btnMUAction(ActionEvent evnet) {
		op = "*";
		makelog(op);
	}
	public void btnMIAction(ActionEvent evnet) {
		op = "-";
		makelog(op);
	}
	public void btnPLAction(ActionEvent evnet) {
		op = "+";
		makelog(op);
	}
	
	
	public void makenum(int n) {
		num = lblIR.getText();
		lblIR.setText(num + Integer.toString(n));
	}
	
	public void makelog(String op) {
		x = Integer.parseInt(lblIR.getText());
		lblIR.setText("");
		lblID.setText(Integer.toString(x) + " " + op + " ");
	}

}

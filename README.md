# DesafioJava
Propuesta al desafio de Java especializcion Back-end
Importar las bibliotecas necesarias:
import javax.swing.;
import java.awt.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;

Crear un objeto ConversorMoneda:
ConversorMoneda conversor = new ConversorMoneda();

Ingresar la cantidad en MXN a convertir en el campo de texto etiquetado como "Cantidad (MXN)".

Seleccionar la moneda de destino en el JComboBox etiquetado como "Moneda de Destino".

Hacer clic en el botón "Convertir".

La cantidad convertida se mostrará en un mensaje emergente.

Tenga en cuenta que la conversión se realiza utilizando los tipos de cambio especificados en el código fuente de la clase en forma de un HashMap llamado "monedas". Si desea agregar o modificar los tipos de cambio, debe modificar el HashMap en el constructor de la clase.

Además, si se ingresa una cantidad inválida en el campo de texto "Cantidad (MXN)", se mostrará un mensaje de error emergente.

¡Disfrute de su conversor de moneda!

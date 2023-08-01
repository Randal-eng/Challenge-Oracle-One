package ventana;

import javax.swing.*;
import conversor.Conversor;
import conversor.ConverterToDolar;
import conversor.ConverterToEuro;
import conversor.ConverterToLibra;
import conversor.ConverterToWon;
import conversor.ConverterToYen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class Ventana extends JFrame implements ActionListener{
    JPanel panel;
    ImageIcon imagen;
    JLabel etiquetaImagen, etiquetaConvertir, etiquetaConvertida, etiquetaInfo;
    JTextField valorConvertir, valorConvertido;
    JButton botonConversor;
    JComboBox lista1, lista2;

    Conversor converter  = new Conversor();
    ConverterToDolar converterDollar = new ConverterToDolar();
    ConverterToEuro converterEuro = new ConverterToEuro();
    ConverterToLibra converterLibra = new ConverterToLibra();
    ConverterToYen converterYen = new ConverterToYen();
    ConverterToWon converterWon = new ConverterToWon();
    
    

    public Ventana(){
        this.setSize(800, 550);
        setTitle("Conversor Alura");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Componentes();
    }

    private void Componentes(){
        colocarPanel();
        colocarEtiquetaImagen();
        colocarEntradasDeValor();
        colocarEtiquetas();
        colocarBoton();
        listaDesplegableConvertir();
    }

    /**
     * Este metodo agrega el panel del programa
     * 
     */
    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
    }

    /**
     * Este metodo coloca una imagen representativa
     */
    private void colocarEtiquetaImagen() {
        imagen = new ImageIcon("PanelFondo.png");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, 800, 200);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)));;

        panel.add(etiquetaImagen);
    }
    /**
     * Este metodo coloca los espacios donde el usuario ingresara los valores a convertir
     * @param ValorConvertido Esta deshabilitado para que el usuario solo pueda ingresar el valor que desea convertir en la etiqueta valor a convertir
     */
    private void colocarEntradasDeValor() {
        valorConvertir = new JTextField();
        valorConvertir.setBounds(160, 230, 180, 20);

        valorConvertido = new JTextField();
        valorConvertido.setBounds(460, 230, 180, 20);
        valorConvertido.setEditable(false);

        panel.add(valorConvertir);
        panel.add(valorConvertido);
    }
    /**
     * Este metodo agrega las etiquetas especificando donde se ingresa el valor a convertir y donde esta el valor convertido
     */
    private void colocarEtiquetas() {
        etiquetaConvertir = new JLabel();
        etiquetaConvertir.setText("Moneda a Convertir");
        etiquetaConvertir.setBounds(178, 255, 150, 20);
        etiquetaConvertir.setFont(new Font("Congenial", Font.BOLD, 14));

        etiquetaConvertida = new JLabel();
        etiquetaConvertida.setText("Moneda Convertida");
        etiquetaConvertida.setBounds(478, 255, 150, 20);
        etiquetaConvertida.setFont(new Font("Congenial", Font.BOLD, 14));

        etiquetaInfo = new JLabel();
        etiquetaInfo.setText("\u00A9 Convertidor para Alura Latam por Randal");
        etiquetaInfo.setBounds(270, 450, 270, 50);
        etiquetaInfo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaInfo.setFont(new Font("Congenial", Font.BOLD, 12));



        panel.add(etiquetaConvertir);
        panel.add(etiquetaConvertida);
        panel.add(etiquetaInfo);
    }
    /**
     * Este metodo agrega el boton que convertira el valor ingresado
     */
    private void colocarBoton() {

        botonConversor = new JButton();
        botonConversor.setBounds(368, 230, 60, 20);
        botonConversor.setText("=");
        botonConversor.setBorderPainted(false);

        //ACTION LISTENER
        botonConversor.addActionListener(this);

        panel.add(botonConversor);
    }
    /**
     * Este metodo son las listas donde estan las monedas disponibles a convertir, el usuario puede escoger cualquier moneda y convertirla
     */
        private void listaDesplegableConvertir() {
            String [] monedaCon = {"Mexicana", "Dolar", "Euro", "Libra Esterlina", "Yen", "Won"};
            String [] moneda = {"Mexicana", "Dolar", "Euro", "Libra Esterlina", "Yen", "Won" };

            lista1 = new JComboBox<>(monedaCon);
            lista1.setBounds(40 ,230 ,100 , 30);

            lista2 = new JComboBox<>(moneda);
            lista2.setBounds(660 ,230 ,100 , 30);

            panel.add(lista1);
            panel.add(lista2);
        }

        /**
         * Las siguientes son variables declaradas para transformar el texto a un double y que los metodos de conversion funcione, despues el valor double es convertido a un texto para poder mostrarse
         */
        String valor;
        Double cantidad;
        Double valorCon;
        DecimalFormat valorConvertidoTexto = new DecimalFormat("#0.000");
        String formattResult;

        /**
         * Los siguientes metodos son las conversiones que se hace para la moneda mexicana
         * 
         */
        public void converterToDollar(){
            valor = valorConvertir.getText();
            cantidad = Double.parseDouble(valor);
            valorCon = converter.converterDolar(cantidad); 
            formattResult = valorConvertidoTexto.format(valorCon);
            valorConvertido.setText(formattResult); 
        }

        public void converterToEuro(){
            valor = valorConvertir.getText();
            cantidad = Double.parseDouble(valor);
            valorCon = converter.converterEuro(cantidad); 
            formattResult = valorConvertidoTexto.format(valorCon);
            valorConvertido.setText(formattResult); 
        }

        public void converterToLibra(){
            valor = valorConvertir.getText();
            cantidad = Double.parseDouble(valor);
            valorCon = converter.converterLibraEsterlina(cantidad); 
            formattResult = valorConvertidoTexto.format(valorCon);
            valorConvertido.setText(formattResult); 
        }

        public void converterToYen(){
            valor = valorConvertir.getText();
            cantidad = Double.parseDouble(valor);
            valorCon = converter.converterYen(cantidad); 
            formattResult = valorConvertidoTexto.format(valorCon);
            valorConvertido.setText(formattResult); 
        }

        public void converterToWon(){
            valor = valorConvertir.getText();
            cantidad = Double.parseDouble(valor);
            valorCon = converter.converterWon(cantidad); 
            formattResult = valorConvertidoTexto.format(valorCon);
            valorConvertido.setText(formattResult); 
        }


        /**
         * Este metodo es la accion que convertir el valdor ingresado al presionar el boton
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            /**
             * El siguiente try catch sirve para identficar si el usuario agregó un valor que no sea un número, el cual lanzara un error indicando que es un valor no valido
             */
            try {
                /**
                 * Lo siguientes son las condiciones para que la moneda sea convertida a la moneda deseada correctamente, cada condicion contiene el codigo de tranformacion de un texto a un double y un double a texto
                 */
                if (lista2.getSelectedItem() == "Mexicana") {
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converter.converterMexicana(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult); 
            }else if(lista2.getSelectedItem() == "Dolar"){
                converterToDollar();
            }else if(lista2.getSelectedItem() == "Euro"){
                converterToEuro();
            }else if(lista2.getSelectedItem() == "Libra Esterlina"){
                converterToLibra();
            }else if(lista2.getSelectedItem() == "Yen"){
                converterToYen();
            }else if(lista2.getSelectedItem() == "Won"){
                converterToWon();
            }
            if(lista1.getSelectedItem() == "Dolar" && lista2.getSelectedItem() == "Mexicana"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterDollar.converterMexicana(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Dolar" && lista2.getSelectedItem() == "Dolar"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterDollar.converterDolar(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult); 
            }else if(lista1.getSelectedItem() == "Dolar" && lista2.getSelectedItem() == "Euro"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterDollar.converterEuro(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);    
            }else if(lista1.getSelectedItem() == "Dolar" && lista2.getSelectedItem() == "Libra Esterlina"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterDollar.converterLibraEsterlina(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Dolar" && lista2.getSelectedItem() == "Yen"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterDollar.converterYen(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Dolar" && lista2.getSelectedItem() == "Won"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterDollar.converterWon(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }
            if(lista1.getSelectedItem() == "Euro" && lista2.getSelectedItem() == "Mexicana"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterEuro.converterMexicana(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Euro" && lista2.getSelectedItem() == "Dolar"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterEuro.converterDolar(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Euro" && lista2.getSelectedItem() == "Euro"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterEuro.converterEuro(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);     
            }else if(lista1.getSelectedItem() == "Euro" && lista2.getSelectedItem() == "Libra Esterlina"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterEuro.converterLibraEsterlina(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Euro" && lista2.getSelectedItem() == "Yen"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterEuro.converterYen(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Euro" && lista2.getSelectedItem() == "Won"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterEuro.converterWon(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }
            if(lista1.getSelectedItem() == "Libra Esterlina" && lista2.getSelectedItem() == "Mexicana"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterLibra.converterMexicana(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Libra Esterlina" && lista2.getSelectedItem() == "Dolar"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterLibra.converterDolar(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);                
            }else if(lista1.getSelectedItem() == "Libra Esterlina" && lista2.getSelectedItem() == "Euro"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterLibra.converterEuro(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult); 
            }else if(lista1.getSelectedItem() == "Libra Esterlina" && lista2.getSelectedItem() == "Libra Esterlina"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterLibra.converterLibra(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);        
            }else if(lista1.getSelectedItem() == "Libra Esterlina" && lista2.getSelectedItem() == "Yen"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterLibra.converterYen(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Libra Esterlina" && lista2.getSelectedItem() == "Won"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterLibra.converterWon(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);                
            }
            if(lista1.getSelectedItem() == "Yen" && lista2.getSelectedItem() == "Mexicana"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterYen.converterMexicana(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);  
            }else if(lista1.getSelectedItem() == "Yen" && lista2.getSelectedItem() == "Dolar"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterYen.converterDolar(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);  
            }else if(lista1.getSelectedItem() == "Yen" && lista2.getSelectedItem() == "Euro"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterYen.converterEuro(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);  
            }else if(lista1.getSelectedItem() == "Yen" && lista2.getSelectedItem() == "Libra Esterlina"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterYen.converterLibraEsterlina(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);  
            }else if(lista1.getSelectedItem() == "Yen" && lista2.getSelectedItem() == "Yen"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterYen.converterYen(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Yen" && lista2.getSelectedItem() == "Won"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterYen.converterWon(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);  
            }
            if (lista1.getSelectedItem() == "Won" && lista2.getSelectedItem() == "Mexicana") {
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterWon.converterMexicana(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);
            }else if(lista1.getSelectedItem() == "Won" && lista2.getSelectedItem() == "Dolar"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterWon.converterDolar(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);                
            }else if(lista1.getSelectedItem() == "Won" && lista2.getSelectedItem() == "Euro"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterWon.converterEuro(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);                
            }else if(lista1.getSelectedItem() == "Won" && lista2.getSelectedItem() == "Libra Esterlina"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterWon.converterLibraEsterlina(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);                
            }else if(lista1.getSelectedItem() == "Won" && lista2.getSelectedItem() == "Yen"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterWon.converterYen(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);                
            }else if(lista1.getSelectedItem() == "Won" && lista2.getSelectedItem() == "Won"){
                valor = valorConvertir.getText();
                cantidad = Double.parseDouble(valor);
                valorCon = converterWon.converterWon(cantidad); 
                formattResult = valorConvertidoTexto.format(valorCon);
                valorConvertido.setText(formattResult);               }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "VALOR INVALIDO!!!");
            }
            
        }
}
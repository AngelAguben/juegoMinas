/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Ángel
 */
public class Juego extends javax.swing.JFrame implements ActionListener {

    //ArrayList donde guardmos todos los botones que tenemos en nuestro juego
    private final ArrayList<JButton> botones = new ArrayList<>();
    //Este contador nos permite comprobar cuantas click realiza el usuario 
    //sobre los botones, lo inicializo a tres ya que en el action listener 
    //según si el resto de contador%2 es par o inpar realizara una cosa u otra
    private static int contador = 3;

    //En este atributo guardaremos todas las rutas de las imagenes repetida una vez cada uno
    //distribuidas de forma aleatoria
    private final ArrayList<String> rutasAleatorias;

    //Aqui vamos a guardar el primer boton pulsado cada vez que encontremos o no parejas
    private static JButton primerBoton;

    //Aqui vamos a guardar el segundo boton pulsado cada vez que encontremos o no parejas
    private static JButton segundoBoton;

    //Aqui vamos a guardar el boton que vamos a comparar si son iguales los dos
    //botones pulsados
    private static JButton botonComprobar;

    //Aqui vamos a guardar la ruta que vamos a comparar si son iguales las dos
    //rutas 
    private static String rutaComprobar;

    private static HashMap<String, String> mapaTextosInformativos = meterTextosInformativos();

    public Juego() {
        //Este metodo inicializa los componentes del juego
        initComponents();
        //Esto evita que el usuario cambie el tamaño de la ventana del juego
        setResizable(false);
        //Este metodo centra la ventana de forma relativa a un componente
        //que le pasemos, al pasarle null centra la ventana en el centro de la pantalla
        setLocationRelativeTo(null);

        //Añadimos a una lista de botones todos los botones de nuestro juego 
        //y le asignamos a cada boton un numero que nos servira para asignarle la
        //ruta a cada boton
        botones.add(jButton1);
        jButton1.setName("0");
        botones.add(jButton2);
        jButton2.setName("1");
        botones.add(jButton3);
        jButton3.setName("2");
        botones.add(jButton4);
        jButton4.setName("3");
        botones.add(jButton5);
        jButton5.setName("4");
        botones.add(jButton6);
        jButton6.setName("5");
        botones.add(jButton7);
        jButton7.setName("6");
        botones.add(jButton8);
        jButton8.setName("7");
        botones.add(jButton9);
        jButton9.setName("8");
        botones.add(jButton10);
        jButton10.setName("9");
        botones.add(jButton11);
        jButton11.setName("10");
        botones.add(jButton12);
        jButton12.setName("11");
        botones.add(jButton13);
        jButton13.setName("12");
        botones.add(jButton14);
        jButton14.setName("13");
        botones.add(jButton15);
        jButton15.setName("14");
        botones.add(jButton16);
        jButton16.setName("15");

        //Le asignamos la imagen demeter a todos los botones
        imagenDemeter(botones);

        //Este bucle nos permite añadir un actionListener a cada botón
        this.botones.forEach(boton -> {
            boton.addActionListener(this);
        });

        rutasAleatorias = new ArrayList<>();

        //Llamamos al metodo asignarAleatorioLista para que nos rellene el atributo 
        //de rutasAleatoria
        asignarAleatorioLista();

    }

    //Metodo para poner las imagenes de demeter al empezar el juego
    //en cada uno de los botones
    private static void imagenDemeter(ArrayList<JButton> botones) {
        ImageIcon imagen = new ImageIcon("imagenes/demeter.png");
        for (int i = 0; i < botones.size(); i++) {
            botones.get(i).setIcon(imagen);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego minas");
        setBackground(java.awt.Color.red);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setForeground(java.awt.Color.red);
        setName("Juego"); // NOI18N
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        // Variables para poner las fotos aleatoriamente
//
//        // Aquí llamaremos al método para meter las rutas en las imágenes
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new Juego().setVisible(true);
//            //Asignamos las rutas en posiciones aleatorias al atributo rutasAleatorias
//        });
//    }
    //En este metodo entrara cada vez que se pulse cualquier botón
    @Override
    public void actionPerformed(ActionEvent ae) {

        //Poner contador cada vez que se ejecute el actionPerformed
        ImageIcon imagen = new ImageIcon("imagenes/demeter.png");

        //Obtenemos el boton que hemos pulsado
        JButton botonPulsado = (JButton) ae.getSource();

        //Guardamos la ruta del boton pulsado utilizando el metodo devolverRuta
        String rutaActual = devolverRuta(botonPulsado);

        if (contador != 3 && contador % 2 == 1 && primerBoton.isEnabled()) {
            primerBoton.setIcon(imagen);
            segundoBoton.setIcon(imagen);
        }

        if (contador % 2 == 1) {
            cambiarImagen(botonPulsado, rutaActual);
            rutaComprobar = rutaActual;
            botonComprobar = botonPulsado;
            primerBoton = botonPulsado;
        } else {

            cambiarImagen(botonPulsado, rutaActual);
            segundoBoton = botonPulsado;

            if (rutaComprobar.equals(rutaActual)) {
                botonPulsado.setEnabled(false);
                botonComprobar.setEnabled(false);

                for (String clave : mapaTextosInformativos.keySet()) {
                    String valor = mapaTextosInformativos.get(clave);
                    if (rutaActual.contains(clave)) {
                        JOptionPane.showMessageDialog(null, valor, clave.toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

        }

        contador++;

    }

    // Esté método servira para añadir al ArrayList todas las rutas de 
    //las imagenes que queremos mostrar, genera una lista de 16 rutas
    //donde cada ruta se repite 1 vez y devuelve esta lista
    public static ArrayList<String> meterRutas() {

        ArrayList<String> listaRutas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            listaRutas.add("imagenes/detectorMinas.png");
            listaRutas.add("imagenes/rata.png");
            listaRutas.add("imagenes/silla.png");
            listaRutas.add("imagenes/protesis.png");
            listaRutas.add("imagenes/suela.png");
            listaRutas.add("imagenes/mundo.png");
            listaRutas.add("imagenes/mina.png");
            listaRutas.add("imagenes/dron.png");
        }

        return listaRutas;

    }

    // Método que devolverá un map con la key y el valor de los textos informativos
    // que se mostrarán cuando encontremos una pareja de cartas ya que cada texto
    // está orientado a un tipo de objeto y su información
    public static HashMap<String, String> meterTextosInformativos() {

        // Creamos un HashMap de dos string
        HashMap<String, String> mapaTextos = new HashMap<>();

        // Ahora, iremos metiendo en el Map, la clave y el texto por cada objeto
        mapaTextos.put("detector", " Fue desarrollado durante la Segunda Guerra Mundial "
                + "\n en el invierno de 1941/1942 por el teniente polaco Józef Kosacki."
                + "\n Gracias a este artefacto en la actualidad se pueden salvar "
                + "\n vidas a causa de la detección de bombas");
        mapaTextos.put("dron", " Emplea un radar embarcado en un dron para detectar "
                + "\n objetos enterrados u ocultos, con una clara aplicación en "
                + "\n la detección de minas antipersona. Son una mayor "
                + "\n velocidad de escaneo y que se evita el contacto con el "
                + "\n suelo, lo que aumenta la seguridad en la detección de "
                + "\n artefactos explosivos como minas antipersona. El sistema "
                + "\n permite, además, detectar objetos metálicos y no "
                + "\n metálicos, a diferencia de la mayoría de detectores "
                + "\n convencionales que solo actúan cuando se trata de objetos de metal.");
        mapaTextos.put("mina", " Son un tipo de mina terrestre. Están diseñadas para "
                + "\n matar o incapacitar a sus víctimas. Se utilizan para colapsar los "
                + "\n servicios médicos enemigos, desmoralizar a sus tropas, y dañar "
                + "\n vehículos no blindados. Hay 6 millones de minas de las cuales "
                + "\n 3 millones siguen activas.");
        mapaTextos.put("mundo", " Se calcula que hay más de 110 millones de minas repartidas "
                + "\n en más de 64 países (la mayoría en África). Cada año más "
                + "\n de veintiséis mil personas mueren o sufren traumáticas "
                + "\n mutilaciones debido a las explosiones de estas armas. "
                + "\n Pueden permanecer activas durante más de cincuenta años "
                + "\n después del fin de un conflicto. Colocar una mina puede "
                + "\n costar 1,8 euros, pero desactivarla puede llegar a mucho "
                + "\n más: hasta 718 euros.");
        mapaTextos.put("protesis", " Este tipo de bombas se utilizan para colapsar los servicios "
                + "\n médicos enemigos, desmoralizar a sus tropas, y dañar vehículos "
                + "\n no blindados. Por ello, se busca sobre todo que hieran gravemente "
                + "\n o mutilen, y no tanto que maten, ya que las consecuencias de un "
                + "\n herido en la guerra son más problemáticas que las de un muerto. "
                + "\n Así, sus efectos más comunes son amputaciones, mutilaciones "
                + "\n genitales, lesiones musculares y en órganos internos, o quemaduras.");
        mapaTextos.put("rata", " Una ONG utiliza ratas gigantes para la remoción de "
                + "\n minas antipersona. Estos animales son entrenados para "
                + "\n detectar el trinitrotolueno (TNT) . Esta ONG ya ha apoyado "
                + "\n la eliminación de minas en Angola, Mozambique y Camboya."
                + "\n Las ratas pueden caminar en los campos minados olfateando "
                + "\n sin activar los explosivos. Una vez localizadas, el personal "
                + "\n se encarga de retirarlas o detonarlas. "
                + "\n Estas ratas son mucho más rápidas en la detección de las minas. "
                + "\n Una rata puede buscar minas en un área del tamaño de "
                + "\n una pista de tenis en media hora, mientras que un operario "
                + "\n emplearía alrededor de cuatro días en cubrir la misma superficie.");
        mapaTextos.put("silla", " La silla rota de Ginebra, Suiza. El monumento se realizó "
                + "\n en agosto de 1997 frente a la Plaza de las Naciones Unidas "
                + "\n por Handicap Internacional. Está hecha de 5,5 toneladas de "
                + "\n madera y tiene una altura de 12 metros.");
        mapaTextos.put("suela", " Una vez la plantilla detecta una mina antipersona a través "
                + "\n de ondas que envía por el suelo, un microprocesador integrado "
                + "\n envía la señal de alerta a un brazalete puesto en la muñeca del "
                + "\n usuario, donde se puede ver la zona afectada y la localización de otras minas. ");

        // Y aquí devolveremos el mapa
        return mapaTextos;

    }

    //Metodo al cual le pasamos una ruta de una imagen y un botton, 
    //crea un nuevo icono con esa ruta y se lo asigna al boton. 
    //CAmbiando la imgen del botón
    private static void cambiarImagen(JButton botonCambiar, String ruta) {
        ImageIcon imagenNueva = new ImageIcon(ruta);
        botonCambiar.setIcon(imagenNueva);
    }

    //Este metodo genera un arrayList de tamaño 16 (número de rutas totales en String), 
    //que le asignara las rutas a cada bóton. Este array cada vez que comience el juego
    //se generara pero con las rutas en posiciones aleatorias, para que los botones
    //tengan cada vez imagenes aleatorias. Ejemplo: El boton jButton1 cojera la ruta
    //de la posicion 1 del array, el jButton2 cojera la 2 posición ...
    public static String[] asignacionAleatorio() {

        ArrayList<String> listaRutas = meterRutas();
        Random random = new Random();
        String[] ruta = new String[16];
        int aleatorio;

        for (int i = 0; i < ruta.length; i++) {

            aleatorio = random.nextInt(listaRutas.size());

            ruta[i] = listaRutas.get(aleatorio);

            listaRutas.remove(aleatorio);

        }

        return ruta;

    }

    //Con este metodo llamamos a asignacionAleatorio y le asignamos todas
    //las rutas aleatorios generadas a una lista que tenemos como atributo de la clase y statica
    public void asignarAleatorioLista() {
        String[] ruta = asignacionAleatorio();

        for (int i = 0; i < 16; i++) {
            rutasAleatorias.add(ruta[i]);
        }
    }

    //Metodo que devuelve la ruta que le pertenece 
    //al boton que ha sido pulsado, le pasaremos el boton,
    //el cual tendra un nombre, si es el boton uno cojera la ruta
    //de la posicion 1 de rutasAleatorias, asi con cada boton.
    public String devolverRuta(JButton boton) {

        String nombreBoton = boton.getName();

        int numeroBoton = Integer.parseInt(nombreBoton);

        return rutasAleatorias.get(numeroBoton);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UIcalculadora {
    private static JTextField campo1ip;
    private static JTextField campo2ip;
    private static JTextField campo3ip;
    private static JTextField campo4ip;
    private static JTextField campo5ipmascara;
    private static JTextField campo1ipbinaria;
    private static JTextField campo2ipbinaria;
    private static JTextField campo3ipbinaria;
    private static JTextField campo4ipbinaria;
    private static JTextField campo1ipredbinaria;
    private static JTextField campo2ipredbinaria;
    private static JTextField campo3ipredbinaria;
    private static JTextField campo4ipredbinaria;
    private static JTextField campo1numeromascara;
    private static JTextField campo2numeromascara;
    private static JTextField campo3numeromascara;
    private static JTextField campo4numeromascara;


    private static JPanel panelprincipal;

    public static JTextField getCampo1ip() {
        return campo1ip;
    }

    public static JTextField getCampo2ip() {
        return campo2ip;
    }

    public static JTextField getCampo3ip() {
        return campo3ip;
    }

    public static JTextField getCampo4ip() {
        return campo4ip;
    }

    public static JTextField getCampo5ipmascara() {
        return campo5ipmascara;
    }

    public static JTextField getCampo1ipbinaria() {
        return campo1ipbinaria;
    }

    public static JTextField getCampo2ipbinaria() {
        return campo2ipbinaria;
    }

    public static JTextField getCampo3ipbinaria() {
        return campo3ipbinaria;
    }

    public static JTextField getCampo4ipbinaria() {
        return campo4ipbinaria;
    }

    public static JTextField getCampo1ipredbinaria() {
        return campo1ipredbinaria;
    }

    public static JTextField getCampo2ipredbinaria() {
        return campo2ipredbinaria;
    }

    public static JTextField getCampo3ipredbinaria() {
        return campo3ipredbinaria;
    }

    public static JTextField getCampo4ipredbinaria() {
        return campo4ipredbinaria;
    }

    public static JTextField getCampo1numeromascara() {
        return campo1numeromascara;
    }

    public static JTextField getCampo2numeromascara() {
        return campo2numeromascara;
    }

    public static JTextField getCampo3numeromascara() {
        return campo3numeromascara;
    }

    public static JTextField getCampo4numeromascara() {
        return campo4numeromascara;
    }

    public static JPanel getPanelprincipal() {
        return panelprincipal;
    }

    public static void UsaCalc(){
        JFrame frame = new JFrame("Calculadora de red");

        panelprincipal = new JPanel();
        panelprincipal.setLayout(new GridLayout(6,1, 0, 5));

        JPanel panelipdecimal = new JPanel();
        panelipdecimal.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
            JLabel etiquetaIPBinaria = new JLabel("IP Decimal");
        panelipdecimal.add(etiquetaIPBinaria);
        campo1ip = new JTextField();
        campo1ip.setPreferredSize(new Dimension(50, 30));
        panelipdecimal.add(campo1ip);
        JLabel guion1 = new JLabel("-");
        panelipdecimal.add(guion1);
        campo2ip = new JTextField();
        campo2ip.setPreferredSize(new Dimension(50, 30));
        panelipdecimal.add(campo2ip);
        JLabel guion2 = new JLabel("-");
        panelipdecimal.add(guion2);
        campo3ip = new JTextField();
        campo3ip.setPreferredSize(new Dimension(50, 30));
        panelipdecimal.add(campo3ip);
        JLabel guion3 = new JLabel("-");
        panelipdecimal.add(guion3);
        campo4ip = new JTextField();
        campo4ip.setPreferredSize(new Dimension(50, 30));
        panelipdecimal.add(campo4ip);
        JLabel barrasepara = new JLabel("/");
        panelipdecimal.add(barrasepara);
        campo5ipmascara = new JTextField();
        campo5ipmascara.setPreferredSize(new Dimension(50, 30));
        panelipdecimal.add(campo5ipmascara);
        panelprincipal.add(panelipdecimal);

        JPanel panelmascaranumero = new JPanel();
        panelmascaranumero.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));

        JLabel etiquetanombremascara = new JLabel("Mascara de subred");
        panelmascaranumero.add(etiquetanombremascara);
        campo1numeromascara = new JTextField();
        campo1numeromascara.setPreferredSize(new Dimension(100, 30));
        campo1numeromascara.setEditable(false);
        panelmascaranumero.add(campo1numeromascara);
        JLabel guion1numeromascara = new JLabel("-");
        panelmascaranumero.add(guion1numeromascara);
        campo2numeromascara = new JTextField();
        campo2numeromascara.setPreferredSize(new Dimension(100, 30));
        campo2numeromascara.setEditable(false);
        panelmascaranumero.add(campo2numeromascara);
        JLabel guion2numeromascara = new JLabel("-");
        panelmascaranumero.add(guion2numeromascara);
        campo3numeromascara = new JTextField();
        campo3numeromascara.setPreferredSize(new Dimension(100, 30));
        campo3numeromascara.setEditable(false);
        panelmascaranumero.add(campo3numeromascara);
        JLabel guion3numeromascara = new JLabel("-");
        panelmascaranumero.add(guion3numeromascara);
        campo4numeromascara = new JTextField();
        campo4numeromascara.setPreferredSize(new Dimension(100, 30));
        campo4numeromascara.setEditable(false);
        panelmascaranumero.add(campo4numeromascara);
        panelprincipal.add(panelmascaranumero);

        JPanel panelipbinaria = new JPanel();
        panelipbinaria.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
        JLabel etiquetaipbinaria = new JLabel("IP Binaria");
        panelipbinaria.add(etiquetaipbinaria);
        campo1ipbinaria = new JTextField();
        campo1ipbinaria.setPreferredSize(new Dimension(100, 30));
        campo1ipbinaria.setEditable(false);
        panelipbinaria.add(campo1ipbinaria);
        JLabel guion1ipbinaria = new JLabel("-");
        panelipbinaria.add(guion1ipbinaria);
        campo2ipbinaria = new JTextField();
        campo2ipbinaria.setPreferredSize(new Dimension(100, 30));
        campo2ipbinaria.setEditable(false);
        panelipbinaria.add(campo2ipbinaria);
        JLabel guion2ipbinaria = new JLabel("-");
        panelipbinaria.add(guion2ipbinaria);
        campo3ipbinaria = new JTextField();
        campo3ipbinaria.setPreferredSize(new Dimension(100, 30));
        campo3ipbinaria.setEditable(false);
        panelipbinaria.add(campo3ipbinaria);
        JLabel guion3ipbinaria = new JLabel("-");
        panelipbinaria.add(guion3ipbinaria);
        campo4ipbinaria = new JTextField();
        campo4ipbinaria.setPreferredSize(new Dimension(100, 30));
        campo4ipbinaria.setEditable(false);
        panelipbinaria.add(campo4ipbinaria);
        panelprincipal.add(panelipbinaria);

        JPanel panelipredbinaria = new JPanel();
        panelipredbinaria.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
        JLabel etiquetaipredbinaria = new JLabel("IP Red Binaria");
        panelipredbinaria.add(etiquetaipredbinaria);
        campo1ipredbinaria = new JTextField();
        campo1ipredbinaria.setPreferredSize(new Dimension(100, 30));
        campo1ipredbinaria.setEditable(false);
        panelipredbinaria.add(campo1ipredbinaria);
        JLabel guion1ipredbinaria = new JLabel("-");
        panelipredbinaria.add(guion1ipredbinaria);
        campo2ipredbinaria = new JTextField();
        campo2ipredbinaria.setPreferredSize(new Dimension(100, 30));
        campo2ipredbinaria.setEditable(false);
        panelipredbinaria.add(campo2ipredbinaria);
        JLabel guion2ipredbinaria = new JLabel("-");
        panelipredbinaria.add(guion2ipredbinaria);
        campo3ipredbinaria = new JTextField();
        campo3ipredbinaria.setPreferredSize(new Dimension(100, 30));
        campo3ipredbinaria.setEditable(false);
        panelipredbinaria.add(campo3ipredbinaria);
        JLabel guion3ipredbinaria = new JLabel("-");
        panelipredbinaria.add(guion3ipredbinaria);
        campo4ipredbinaria = new JTextField();
        campo4ipredbinaria.setPreferredSize(new Dimension(100, 30));
        campo4ipredbinaria.setEditable(false);
        panelipredbinaria.add(campo4ipredbinaria);

        panelprincipal.add(panelipredbinaria);

        JPanel panelbotoncalcular = new JPanel();
        panelbotoncalcular.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
        JButton botoncalcular = new JButton("Calcular");
        panelbotoncalcular.setPreferredSize(new Dimension(100, 30));
        panelbotoncalcular.add(botoncalcular);
        panelprincipal.add(panelbotoncalcular);
        JPanel panelerrores = new JPanel();
        panelerrores.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
        JLabel labelerrores = new JLabel("Errores: ");
        panelerrores.add(labelerrores);
        JTextField textoerrores = new JTextField();
        textoerrores.setEditable(false);
        textoerrores.setPreferredSize(new Dimension(500, 30));
        panelerrores.add(textoerrores);
        panelprincipal.add(panelerrores);

        botoncalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Hacercalculos calculadora = new Hacercalculos();
                calculadora.Calcularip(textoerrores);
            }
        });

        frame.getContentPane().add(panelprincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 1020);
        frame.setVisible(true);








    }


}
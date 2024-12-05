import javax.swing.*;

public class Hacercalculos {

    public void Calcularip(JTextField textoerrores) {
        String ip1 = UIcalculadora.getCampo1ip().getText().trim();
        String ip2 = UIcalculadora.getCampo2ip().getText().trim();
        String ip3 = UIcalculadora.getCampo3ip().getText().trim();
        String ip4 = UIcalculadora.getCampo4ip().getText().trim();
        String prefijo = UIcalculadora.getCampo5ipmascara().getText().trim();

        if (ip1.isEmpty() || ip2.isEmpty() || ip3.isEmpty() || ip4.isEmpty()) {
            textoerrores.setText("Los campos de la IP no pueden estar vacíos.");
            return;
        }

        if (!esNumeroValido(ip1) || !esNumeroValido(ip2) || !esNumeroValido(ip3) || !esNumeroValido(ip4)) {
            textoerrores.setText("La IP debe contener solo números válidos.");
            return;
        }

        int[] ipArray = new int[4];
        ipArray[0] = Integer.parseInt(ip1);
        ipArray[1] = Integer.parseInt(ip2);
        ipArray[2] = Integer.parseInt(ip3);
        ipArray[3] = Integer.parseInt(ip4);

        for (int i = 0; i < 4; i++) {
            if (ipArray[i] < 0 || ipArray[i] > 255) {
                textoerrores.setText("Los valores de la IP deben estar entre 0 y 255.");
                return;
            }
        }

        if (prefijo.isEmpty()) {
            prefijo = obtenerPrefijoPorClase(ipArray);
            UIcalculadora.getCampo5ipmascara().setText(prefijo);
        }

        int prefijoInt = Integer.parseInt(prefijo);
        if (prefijoInt < 0 || prefijoInt > 32) {
            textoerrores.setText("El prefijo debe estar entre 0 y 32.");
            return;
        }

        String mascaraBinaria = generarMascaraBinariaEnBinario(prefijoInt);

        String[] mascaraBinariaPartes = mascaraBinaria.split("\\.");
        UIcalculadora.getCampo1numeromascara().setText(mascaraBinariaPartes[0]);
        UIcalculadora.getCampo2numeromascara().setText(mascaraBinariaPartes[1]);
        UIcalculadora.getCampo3numeromascara().setText(mascaraBinariaPartes[2]);
        UIcalculadora.getCampo4numeromascara().setText(mascaraBinariaPartes[3]);

        String ipBinaria = obtenerIpBinaria(ipArray);
        String[] partesIpBinaria = ipBinaria.split("\\.");
        UIcalculadora.getCampo1ipbinaria().setText(partesIpBinaria[0]);
        UIcalculadora.getCampo2ipbinaria().setText(partesIpBinaria[1]);
        UIcalculadora.getCampo3ipbinaria().setText(partesIpBinaria[2]);
        UIcalculadora.getCampo4ipbinaria().setText(partesIpBinaria[3]);

        String ipRedBinaria = obtenerIpRedBinaria(ipArray, prefijoInt);
        String[] partesIpRedBinaria = ipRedBinaria.split("\\.");
        UIcalculadora.getCampo1ipredbinaria().setText(partesIpRedBinaria[0]);
        UIcalculadora.getCampo2ipredbinaria().setText(partesIpRedBinaria[1]);
        UIcalculadora.getCampo3ipredbinaria().setText(partesIpRedBinaria[2]);
        UIcalculadora.getCampo4ipredbinaria().setText(partesIpRedBinaria[3]);

        textoerrores.setText("");
    }

    private String generarMascaraBinariaEnBinario(int prefijo) {
        StringBuilder mascara = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (prefijo >= 8) {
                mascara.append("11111111.");
                prefijo -= 8;
            } else if (prefijo > 0) {
                String binario = String.format("%8s", Integer.toBinaryString(255 << (8 - prefijo) & 255)).replace(' ', '0');
                mascara.append(binario).append(".");
                prefijo = 0;
            } else {
                mascara.append("00000000.");
            }
        }
        return mascara.toString().substring(0, mascara.length() - 1);
    }

    private boolean esNumeroValido(String campo) {
        try {
            Integer.parseInt(campo);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String obtenerPrefijoPorClase(int[] ipArray) {
        if (ipArray[0] >= 1 && ipArray[0] <= 127) {
            return "8";
        } else if (ipArray[0] >= 128 && ipArray[0] <= 191) {
            return "16";
        } else if (ipArray[0] >= 192 && ipArray[0] <= 223) {
            return "24";
        } else if (ipArray[0] >= 224 && ipArray[0] <= 239) {
            return "4";
        } else {
            return "0";
        }
    }

    private String obtenerIpBinaria(int[] ipArray) {
        StringBuilder ipBinaria = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ipBinaria.append(String.format("%8s", Integer.toBinaryString(ipArray[i])).replace(' ', '0')).append(".");
        }
        return ipBinaria.toString().substring(0, ipBinaria.length() - 1);
    }

    private String obtenerIpRedBinaria(int[] ipArray, int prefijo) {
        StringBuilder ipRedBinaria = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (prefijo >= 8) {
                ipRedBinaria.append(String.format("%8s", Integer.toBinaryString(ipArray[i])).replace(' ', '0')).append(".");
                prefijo -= 8;
            } else if (prefijo > 0) {
                ipRedBinaria.append(String.format("%" + prefijo + "s", Integer.toBinaryString(ipArray[i] & (255 << (8 - prefijo)))).replace(' ', '0')).append(".");
                prefijo = 0;
            } else {
                ipRedBinaria.append("00000000.");
            }
        }
        return ipRedBinaria.toString().substring(0, ipRedBinaria.length() - 1);
    }
}

package cardiotrack;

public class Medicao {
    private String data;
    private String horario;
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private boolean estaEstressado;

    public Medicao(String data, String horario, int pressaoSistolica, int pressaoDiastolica, boolean estaEstressado) {
        this.data = data;
        this.horario = horario;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.estaEstressado = estaEstressado;
    }

    public boolean isEstaEstressado() {
        return estaEstressado;
    }

    public void setEstaEstressado(boolean estaEstressado) {
        this.estaEstressado = estaEstressado;
    }



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(int pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public int getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public void setPressaoDiastolica(int pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }


}

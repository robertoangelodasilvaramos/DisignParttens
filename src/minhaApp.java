public class minhaApp {
  public static void main(String[] args) {
    //
      Janela janela = Janela.getInstance();

      janela.pack();
      janela.setVisible(true);
      Janela janela2 = Janela.getInstance();

      janela2.pack();
      janela2.setVisible(true);
  }
}

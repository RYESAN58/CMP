public interface Mover {
  String move();

  default String move(int count) {
      if (count <= 0) {
          return "";
      }
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < count; i++) {
          sb.append(move());
          if (i < count - 1) {
              sb.append("\n");
          }
      }
      return sb.toString();
  }
}

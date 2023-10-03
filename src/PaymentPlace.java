public enum PaymentPlace {
  COUNTER, ONLINE;

  @Override
  public String toString() {
    return this.name();
  }
}

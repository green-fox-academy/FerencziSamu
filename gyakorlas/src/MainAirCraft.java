public class MainAirCraft {
  public static void main(String[] args){
    F35 maverick = new F35();
    F35 kala = new F35();
    F35 mala = new F35();
    F35 pala = new F35();
    F35 rala = new F35();
    F16 tango = new F16();
    F16 bango = new F16();
    F16 mango = new F16();
    F16 lango = new F16();
    F16 pango = new F16();
    AircraftCarrier first = new AircraftCarrier(5000,500);
    AircraftCarrier second = new AircraftCarrier(5000,500);
    first.add(maverick);
    first.add(kala);
    first.add(tango);
    first.add(bango);
    first.add(mango);
    first.add(lango);
    second.add(mala);
    second.add(pala);
    second.add(rala);
    second.add(pango);
    pala.refill(50);
    tango.refill(20);
    first.fight(second);
    System.out.println(first.getStatus());
    System.out.println(second.getStatus());


  }
}

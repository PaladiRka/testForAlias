class Main {
      static void main(String[] args) {
        JurassicPark p1 = new JurassicPark();
        Dinosaur q = new Dinosaur();
        String t = "Ivan";
        q.name = t;
        p1.add(q);
        JurassicPark p2 = new JurassicPark(); 
        Dinosaur g = p1.get(0);	
        Object m = g.name;
        System.out.println(m);
        m = t;
      }

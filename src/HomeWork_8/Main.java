package HomeWork_8;

public class Main {

    public static void main(String[] args) {
	Student john = new Student("John");
        Student mark = new Student("Mark");
        Student paul = new Student("Paul");
        Student petrosian = new Student("Petrosian");
        Student vasosian = new Student("vasosian");
        Student multosian = new Student("multosian");
        Student[] group1 = new Student[]{john, mark, paul};
        Student[] group2 = new Student[]{john, mark, paul};
        Student[] group3 = new Student[]{petrosian, vasosian, multosian};
        Container cont = new Container();
        cont.add(petrosian);
      Container container1 = new Container(group1);
        System.out.println("is empty?" + container1.isEmpty());
        Container container2 = new Container(group2);
      Container container3 = new Container(group3);
        System.out.println(container1.isEmpty());
        System.out.println(container1.size());
        System.out.println(container1.contains(petrosian));
        System.out.println(container1.add(petrosian));
//        System.out.println(container1.remove(petrosian));
//        System.out.println(container1.retainAll(container3));
//        System.out.println(container1.removeAll(container2));
        System.out.println(container1.iterator().hasNext());
        System.out.println(container1.iterator().next());

    }
}

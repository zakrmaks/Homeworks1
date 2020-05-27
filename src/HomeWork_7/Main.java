package HomeWork_7;

public class Main {

    public static void main(String[] args) {
	Student john = new Student("John");
        Student mark = new Student("Mark");
        Student petrosian = new Student("Petrosian");
        Student vasosian = new Student("vasosian");
        Student multosian = new Student("multosian");
        Student paul = new Student("Paul");
        Student[] group1 = new Student[]{john, mark, paul};
        Student[] group2 = new Student[]{john, mark, paul};
        Student[] group3 = new Student[]{john, mark, paul};
        Collection type = new Collection(group1);
        Collection ex2 = new Collection(group2);
        System.out.println(type.isEmpty());
        System.out.println(type.contains(petrosian));
        type.add(petrosian);
        type.add(vasosian);
        type.add(multosian);
        type.remove(petrosian);
//        System.out.println(type.remove(paul));
//        type.addAll(ex2);
        System.out.println();
        type.removeAll(ex2);
        System.out.println(type.containAll(ex2));
    }
}

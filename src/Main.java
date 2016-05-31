public class Main {

    public static void main(String[] args) {
        Slogan slogan = new Slogan();
        //я все таки решил, что будет правильнее вызвать метод вывода слогана не в конструкторе
        slogan.printRandomSlogan();

        //тут создаем объекты через конструктор с параметром
        Project superCar = new Project("BMW");
        Project megaComputer = new Project("NewMac");
        //создаем массив проектов
        Project[] projects = new Project[]{superCar, megaComputer};


        System.out.println();
        System.out.println("Projects:");
        Project resultProject;
        //тут итерируемся (тоесть пробегаем по всем елементам) по массиву и выводим его
//        for(int i = 0; i < projects.length; i++){
//            resultProject = projects[i];
//            System.out.println(resultProject.getName());
//        }

        int j = 0;
        while (j < projects.length){
            resultProject = projects[j];
            System.out.println(resultProject.getName());
            j++;
        }

    }
}

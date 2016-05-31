public class Slogan {
    private String[] sloganArray;

    public Slogan(){
        init();
    }

    public void printRandomSlogan(){
        //вызываем метод и помещаем возвращенное значение из метода в переменную randomIndex
        int randomIndex = getRandomSloganArrayIndex();
        System.out.println(sloganArray[randomIndex]);
    }

    private int getRandomSloganArrayIndex(){
        //тут генерируем случайное число от 0 до 2
        double randomValue = Math.random() * sloganArray.length;
        //на нам надо вернуть тип int поэтому приводим сгенерированное число к нужному питу
        int randomToInt = (int) randomValue;
        return randomToInt;
    }
    //начальная инициалзация объекта
    private void init(){
        sloganArray = new String[3];
        sloganArray[0] = "Life is Good";
        sloganArray[1] = "Play Beyond";
        sloganArray[2] = "Let's Make Things Better";
    }

}

public class Main {
    public static void main(String[] args) {
System.out.println("Task 1");
int a = 214747;
byte b = 127;
short с = 32767;
long d = 1254488677123456677L;
float e = 3.4f;
double f = 32.29;
System.out.println("Целочисленные переменные");
System.out.println("int = "+ a);
System.out.println("byte = "+ b);
System.out.println("short = "+ с);
System.out.println("long = "+ d);
System.out.println("Переменные с плавающей точкой");
System.out.println("float = "+ e);
System.out.println("double = "+ f);
System.out.println();

System.out.println("Task 2");
float g = 27.12f;
long h = 987678965549L;
double i = 2.786;
short j = 569;
short k = -159;
int l = 27897;
byte m = 67;
System.out.println("float = "+g);
System.out.println("long = "+h);
System.out.println("double = "+i);
System.out.println("short = "+j);
System.out.println("short = "+k);
System.out.println("int = "+l);
System.out.println("byte = "+m);
System.out.println();

System.out.println("Task 3");
byte ludasStudents = 23;
byte annasStudents = 27;
byte ekaterinasStudents = 30;
int totalStudents = ludasStudents + annasStudents + ekaterinasStudents;
int totalPaper = 480;
int papersForStudents = totalPaper/totalStudents;
System.out.println("На каждого ученика рассчитано "+papersForStudents+" листов бумаги.");
System.out.println();

System.out.println("Task 4");
int machinePerformance = 16/2;
int machinePerformance20 = machinePerformance*20;
int machinePerformance24 = machinePerformance*24*60;
int machinePerformance3 = machinePerformance24*3;
int machinePerformance1 = machinePerformance24*31;
System.out.println("За 20 минут машина произвела "+machinePerformance20+" штук бутылок");
System.out.println("За сутки машина произвела "+machinePerformance24+" штук бутылок");
System.out.println("За 3 дня машина произвела "+machinePerformance3+" штук бутылок");
System.out.println("За месяц машина произвела "+machinePerformance1+" штук бутылок");
System.out.println();

System.out.println("Task 5");
int total = 120;
int white = 2;
int brown = 4;
int classTotal = white+brown;
int rooms = total/classTotal;
int whiteTotal = white*rooms;
int brownTotal = brown*rooms;
System.out.println("В школе, где "+rooms+" классов, нужно "+whiteTotal+" банок белой краски и "+brownTotal+" банок коричневой краски");
System.out.println();

System.out.println("Task 6");
double bananas = 5f;
double bananaGram = 80f;
double totalBananaGram = bananas*bananaGram;

double milk = 200;
double milkGram = 1.05;
double totalMilkGram = milk*milkGram;

double iceCream = 2;
double iceCreamGram = 100;
double totalIceCreamGram = iceCream*iceCreamGram;

double eggs = 4;
double eggsGram = 70;
double totalEggsGram = eggs*eggsGram;

double breakFast = totalBananaGram + totalMilkGram + totalIceCreamGram + totalEggsGram;
double breakFastKg = (breakFast/1000);

System.out.println("Банан ="+totalBananaGram+" г");
System.out.println("Молоко ="+totalMilkGram+" г");
System.out.println("Мороженое ="+totalIceCreamGram+" г");
System.out.println("Яйца ="+totalEggsGram+" г");
System.out.println("Вес завтрака в граммах ="+breakFast+" г");
System.out.println("Вес завтрака в килограммах ="+breakFastKg+" кг");
System.out.println();

System.out.println("Task 7");
int weightKg = 7;
int weightG = weightKg*1000;
int easyLoss = 250;
int hardLoss = 500;
int easyDays = weightG/easyLoss;
int hardDays = weightG/hardLoss;
int averageLoss = (easyLoss+hardLoss)/2;
int averageDays = weightG/averageLoss;
System.out.println("Масса в граммах = "+weightG+" г");
System.out.println("При потере 250 г/день = "+easyDays+" дней");
System.out.println("При потере 500 г/день = "+hardDays+" дней");
System.out.println("Средняя потеря в день = "+averageLoss+" г");
System.out.println("При средней потере = "+averageDays+" дней");
System.out.println();

System.out.println("Task 7");
int masha = 67760;
int denis = 83690;
int kristina = 76230;
float increase = 1.1f;
float incMasha = masha*(float)increase;
float incDenis = denis*(float)increase;
float incKristina = kristina*(float)increase;
float difMasha = (float)incMasha-masha;
float difDenis = (float)incDenis-denis;
float difKristina = (float)incKristina-kristina;
System.out.println("Маша после повышения получает "+incMasha);
System.out.println("Денис после повышения получает "+incDenis);
System.out.println("Кристина после повышения получает "+incKristina);
System.out.println("Разница у Маши составила "+difMasha);
System.out.println("Разница у Дениса составила "+difDenis);
System.out.println("Разница у КРистины составила "+difKristina);
System.out.println();
    }
}
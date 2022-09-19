
public class Car extends WheeledTransport implements Service {



    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}

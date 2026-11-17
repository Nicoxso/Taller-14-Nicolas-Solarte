public class AdaptadorSensorImportado implements SensorImportado{
    private SensorImportado sensor;
    public AdaptadorSensorImportado(SensorImportado){
        this.sensor=sensor;
    }
    @Override
    public String getNombre(){
        return sensor.getModelo();
    }
    @Overridepublic double leerCelsius(){
        return(sensor.readFahrenheit()-32)*5/9;
    }
}
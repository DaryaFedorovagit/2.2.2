package web.servic;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    private final List<Car> avto = new ArrayList<>();
    {
        avto.add(new Car("Opel","red",2021));
        avto.add(new Car("Mazda","red",2020));
        avto.add(new Car("Kia","black",2022));
        avto.add(new Car("Toyota","gray",2023));
        avto.add(new Car("BMW", "white", 2024));
    }
    @Override
    public List<Car> listcar(Integer count) {
        return avto.stream().limit(count).collect(Collectors.toList());
    }
}

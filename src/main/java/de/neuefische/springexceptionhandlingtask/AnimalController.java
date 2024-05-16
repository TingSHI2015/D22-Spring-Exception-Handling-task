package de.neuefische.springexceptionhandlingtask;

import de.neuefische.springexceptionhandlingtask.exception.ErrorMessage;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    //coding2: local exception handler
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ErrorMessage handelIllegalArgumentException(IllegalArgumentException exception){
//        exception.printStackTrace();
//        return new ErrorMessage(exception.getMessage());
//    }
//
//    @ExceptionHandler(NoSuchElementException.class)
//    public ErrorMessage handelNoSuchElementException(NoSuchElementException exception){
//        exception.printStackTrace();
//        return new ErrorMessage(exception.getMessage());
//    }

/*    @ExceptionHandler(Exception.class)
    public ErrorMessage handelException(Exception exception){
        exception.printStackTrace();
        return new ErrorMessage(exception.getMessage());
    }*/



    @GetMapping("{species}")
    String getAnimalSpecies(@PathVariable String species) {
        if (!species.equals("dog")) {
            throw new IllegalArgumentException("Only 'dog' is allowed");
        }
        return species;
    }

    @GetMapping
    String getAllAnimals() {
        throw new NoSuchElementException("No Animals found");
    }
}

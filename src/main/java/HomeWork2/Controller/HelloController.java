package HomeWork2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Controller
public class HelloController {


    @RequestMapping("/workers")
    public String workersAction(Model model) throws IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(30);
        List<Integer> listOfNumbers = new ArrayList<>();

        String valueFromTXT = new String();


        Path filePath = Paths.get("/home/greghp/Pulpit/Szkolenie JAVA/homeWork_02/src/main/java/HomeWork2/workers.txt");
        Scanner scanner = new Scanner(filePath);


        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                listOfNumbers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }

        for (Integer l : listOfNumbers) {
            if (l.equals(randomNumber)) {

//            valueFromTXT = new Scanner(new File("workers.txt")).useDelimiter("\\Z").next();
            valueFromTXT = "tak";
            break;
            }
        }
        model.addAttribute("valueFromTXT", valueFromTXT);
        model.addAttribute("randomNumber", randomNumber);
        return "workers";

    }
}


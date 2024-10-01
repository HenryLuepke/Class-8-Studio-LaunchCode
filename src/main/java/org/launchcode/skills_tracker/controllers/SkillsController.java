package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String languages() {
        String html =
                "<html>" +
                        "<body>" +
                            "<h1> Skills Tracker" +
                            "</h1>" +
                                "<h2>" +
                                "</h2>" +
                                    "<ol>" +
                                        "<li>JavaScript</li>" +
                                        "<li>Java</li>" +
                                        "<li>Kotlin</li>" +
                                    "</ol>" +
                        "</body>" +
                 "</html>";

        return html;
    }

    @PostMapping("langs")
    @ResponseBody
    public String formSubmittedPage(
            @RequestParam String name,
            @RequestParam String language1,
            @RequestParam String language2,
            @RequestParam String language3){

        String html =
                "<html>" +
                        "<body>" +
                            "<h1>" +
                            name +
                            "</h1>" +
                            "<h2>" +
                            "</h2>" +
                                "<ol>" +
                                    "<li>" + language1 + "</li>" +
                                    "<li>" + language2 + "</li>" +
                                    "<li>" + language3 + "</li>" +
                                "</ol>" +
                            "</body>" +
                        "</html>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        String html =
                "<html>" +
                    "<body>" +
                        "<form method='post' action='langs'>" +
                        "<label for='name'>Name: </label><br>" +
                        "<input type ='text' id='name' name='name'/><br>" +
                        "<label for='langList1'>My Favorite Language:</label><br>" +
                        "<select id='languages' name='language1'>" +
                            "<option disabled selected value> -- select an option -- </option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Kotlin'>Kotlin</option>" +
                        "</select><br>" +
                        "<label for='langList2'>My Second Favorite Language:</label><br>" +
                        "<select id='languages' name='language2'>" +
                            "<option disabled selected value> -- select an option -- </option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Kotlin'>Kotlin</option>" +
                        "</select><br>" +
                        "<label for='langList3'>My Third Favorite Language:</label><br>" +
                        "<select id='languages' name='language3'>" +
                            "<option disabled selected value> -- select an option -- </option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Kotlin'>Kotlin</option>" +
                        "</select><br>" +
                        "<input type='submit' value='submit' />" +
                        "</form>" +
                    "</body" +
                "</html>";

        return html;
    }


}

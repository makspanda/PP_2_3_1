package web.controller;


import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userDao.getUsers());
        return "list";
    }

    @GetMapping("/add")
    public String addUser(@ModelAttribute("user") User user) {
        return "add";
    }

    @PostMapping("/add")
    public String saveUser(@ModelAttribute("user") User user) {
        userDao.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam(name = "id") Long id, Model model) {
        model.addAttribute("user", userDao.findUser(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String saveEdit(@ModelAttribute("user") User user) {
        userDao.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam(name = "id") Long id) {
        userDao.deleteUser(id);
        return "redirect:/";
    }
}
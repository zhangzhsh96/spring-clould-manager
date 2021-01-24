package org.example.controller;

import org.example.entities.Person;
import org.example.entities.Result;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class providerController {
    @GetMapping("/result/{name}/{age}")
    public Result<Person> result(@PathVariable String name, @PathVariable int age) {
        System.out.println(name);
        return new Result<>("200", new Person(name, age));
    }

    @PostMapping("/id/{name}")
    public Result<Person> add(@PathVariable String name,@RequestParam int age,@RequestParam("adds") String add) {
        System.out.println("name:"+name+",age:"+age+",adds:"+add);
        return new Result<>("200", new Person(name, age));
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        list.stream().peek(str -> System.out.println(str + "_test")).map(str -> str + "_test").forEach(str -> System.out.println(str));

    }
}

package sample.reactive.s5.rx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sample.reactive.s5.rx.component.MyReactiveLibrary;
import sample.reactive.s5.rx.domain.Sir;

public class FooController {
    private final MyReactiveLibrary reactiveLibrary;

    public FooController(@Autowired MyReactiveLibrary reactiveLibrary) {
        this.reactiveLibrary = reactiveLibrary;
    }

    @RequestMapping("hello/{who}")
    @ResponseBody
    public Mono<String> hello(@PathVariable String who) {
        return Mono.just(who)
                .map(w -> "Hello " + w + "!");
    }

    @RequestMapping(value = "heyMister", method = RequestMethod.POST)
    @ResponseBody
    public Flux<String> hey(@RequestBody Mono<Sir> body) {



        return Mono.just("Hey mister ")
                .concatWith(body
                        .flatMap(sir -> Flux.fromArray(sir.getLastName().split(""))
                        .map(String::toUpperCase).next())
                ).concatWith(Mono.just(". how are you?"));
    }
}

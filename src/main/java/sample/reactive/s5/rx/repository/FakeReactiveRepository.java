package sample.reactive.s5.rx.repository;

import org.reactivestreams.Publisher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sample.reactive.s5.rx.domain.Sir;

public class FakeReactiveRepository  implements ReactiveCrudRepository<Sir, String> {



    //== NOT IMPLEMENTED ==
    @Override
    public <S extends Sir> Mono<S> save(S s) {
        return null;
    }

    @Override
    public <S extends Sir> Flux<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Sir> Flux<S> saveAll(Publisher<S> publisher) {
        return null;
    }





    @Override
    public Mono<Sir> findById(String s) {

        return Mono.just(s)
                .then(id -> {
                    return Mono.empty();
                    if ("notfound".equalsIgnoreCase(s))
                        return Mono.empty();
                    else
                        return Mono.just(new Sir(s, "GUY"));
                });
    }

    @Override
    public Mono<Sir> findById(Publisher<String> publisher) {
        return null;
    }

    /*@Override
    public Mono<Sir> findOne(String s) {
        return Mono.just(s)
                .then(id -> {
                    if ("notfound".equalsIgnoreCase(s))
                        return Mono.empty();
                    else
                        return Mono.just(new Sir(s, "GUY"));
                });
    }*/

/*    @Override
    public Mono<Sir> findOne(Mono<String> s) {
        return null;
    }*/



    @Override
    public Mono<Boolean> existsById(String s) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<String> publisher) {
        return null;
    }



/*    @Override
    public Mono<Boolean> exists(String s) {
        return null;
    }

    @Override
    public Mono<Boolean> exists(Mono<String> mono) {
        return null;
    }*/

    @Override
    public Flux<Sir> findAll() {
        return null;
    }

    @Override
    public Flux<Sir> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public Flux<Sir> findAllById(Publisher<String> publisher) {
        return null;
    }

    /*@Override
    public Flux<Sir> findAll(Iterable<String> iterable) {
        return null;
    }

    @Override
    public Flux<Sir> findAll(Publisher<String> publisher) {
        return null;
    }*/

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String s) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<String> publisher) {
        return null;
    }

/*    @Override
    public Mono<Void> delete(String s) {
        return null;
    }*/

    @Override
    public Mono<Void> delete(Sir sir) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends Sir> iterable) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends Sir> publisher) {
        return null;
    }

/*    @Override
    public Mono<Void> delete(Iterable<? extends Sir> iterable) {
        return null;
    }

    @Override
    public Mono<Void> delete(Publisher<? extends Sir> publisher) {
        return null;
    }*/

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}

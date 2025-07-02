package org.example.expert.domain.todo.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.todo.entity.QTodo;
import org.example.expert.domain.todo.entity.Todo;

@RequiredArgsConstructor
public class TodoRepositoryCustomImpl implements TodoRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public Todo findByIdWithDSL(Long TodoId) {

        QTodo todo = QTodo.todo;

        return queryFactory.selectFrom(todo)
                .where(todo.id.eq(TodoId))
                .fetchOne();
    }
}

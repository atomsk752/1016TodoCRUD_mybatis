package org.atomsk.controller;

import org.atomsk.domain.Todo;
import org.atomsk.mapper.TodoMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class TodoMapperTests extends AbstractTests {

	@Setter(onMethod_ = @Autowired)
	private TodoMapper mapper;

	@Test
	public void test1() {
		log.info(mapper.read());
	}

	@Test
	public void test2() {
		mapper.create("야야야야");
	}

	@Test
	public void test3() {
		Todo todo = new Todo();
		todo.setTitle("야이씨");
		todo.setTno(5);
		mapper.update(todo);
	}

	@Test
	public void test4() {
		mapper.delete(5);
	}

}

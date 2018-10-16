package org.atomsk.mapper;

import java.util.List;

import org.atomsk.domain.Todo;

public interface TodoMapper {

	public List<Todo> read();

	public void create(String title);

	public void update(Todo todo);

	public void delete(Integer tno);

}

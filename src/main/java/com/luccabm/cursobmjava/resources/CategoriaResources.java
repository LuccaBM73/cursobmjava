package com.luccabm.cursobmjava.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.luccabm.cursobmjava.domain.Categoria;
@RestController
@RequestMapping(value="/categorias") //Endpoint sempre em minusculo
public class CategoriaResources 
{
	@RequestMapping(method=RequestMethod.GET) 
	public List<Categoria> listar()
	{
			
			
			Categoria cat1 = new Categoria(1,"Informática");
			Categoria cat2 = new Categoria(2,"Escritorio");
			
			List<Categoria> lista = new ArrayList<>();	
			lista.add(cat1);
			lista.add(cat2);
			
			return lista;
			
		}
	
	
	
	
	
	
	
}

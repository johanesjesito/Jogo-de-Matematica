package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Backup {
	
	public static void salvarPontuacao(Rank rank) throws FileNotFoundException, IOException
	{
		File file = new File("arquivos/rank.xml");
		OutputStream stream = null;
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("Rank", Rank.class);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				file.delete();
				file.createNewFile();
			}
			
			stream = new FileOutputStream(file);
			xstream.toXML(rank, stream);
			
		
	}
	
	public static Rank ler() {
		Rank rank = null;
		File file = new File("arquivos/rank.xml");
		XStream xStream = new XStream(new DomDriver());
		
		xStream.alias("Rank", Rank.class);
		xStream.aliasField("nome", Rank.class, "nome");
		xStream.aliasField("pontuacao", Rank.class, "pontuacao");
		
		try {

			if (file.exists()) {
				rank = (Rank) xStream.fromXML(file);
			}

		} catch (Exception e) {

			System.err.println("Erro ao ler");

		}
		return rank;
	}
	
}

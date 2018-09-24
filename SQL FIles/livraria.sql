CREATE TABLE IF NOT EXISTS livro (
id BIGINT NOT NULL auto_increment,
nome VARCHAR(150) NOT NULL,
autor VARCHAR(120) NOT NULL,
imagem VARCHAR(200) NOT NULL,
ano VARCHAR(4) NOT NULL,
nota INT(2),
resenha TEXT NOT NULL,
cadastro VARCHAR(12),
PRIMARY KEY (id)
);
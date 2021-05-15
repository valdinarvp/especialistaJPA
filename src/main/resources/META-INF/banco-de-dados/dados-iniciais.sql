insert into produto (id, nome, descricao, preco) values (1,'Kindle', 'Conheça o novo Kindle, agora com iluminação embutida ajustável.', 499.00);
insert into produto (id, nome, descricao, preco) values (3,'Câmera GoPro Hero 7', 'Desempenho 2X maior que outra câmera.', 1499.00);
insert into cliente (id, nome, sexo) values(1,"Vinícius Pereira", "Masculino");
insert into cliente (id, nome, sexo) values(2, "Vitória Karina", "Feminino");
insert into cliente (id, nome, sexo) values(3, "Karla Pereira", "Feminino");


insert into pedido (id, cliente_id, data_pedido, total, status) values (1, 1, sysdate(), 100.0, 'AGUARDANDO');
insert into item_pedido (id, pedido_id, produto_id, preco_produto, quantidade) values (1, 1, 1, 5.0, 2);

insert into categoria (id, nome) values (1, "Eletônicos");

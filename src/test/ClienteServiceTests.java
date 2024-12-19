@SpringBootTest
public class ClienteServiceTests {

    @Autowired
    private ClienteService clienteService;

    @Test
    public void deveSalvarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente Teste");
        cliente.setEmail("teste@exemplo.com");
        cliente.setTelefone("123456789");

        Cliente clienteSalvo = clienteService.salvar(cliente);
        assertNotNull(clienteSalvo.getId());
    }
}

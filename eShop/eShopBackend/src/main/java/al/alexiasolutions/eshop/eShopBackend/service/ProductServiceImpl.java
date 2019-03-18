package al.alexiasolutions.eshop.eShopBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.alexiasolutions.eshop.eShopBackend.dao.ProductDAO;
import al.alexiasolutions.eshop.eShopBackend.dto.ListProductDTO;
import al.alexiasolutions.eshop.eShopBackend.dto.ProductRequestDTO;

@Service(value = "ProductServiceImpl")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public List<ListProductDTO> listproduct(ProductRequestDTO request) {
		
		return dao.listproduct(request.getN_idproduct());
		
	}
	
	

}

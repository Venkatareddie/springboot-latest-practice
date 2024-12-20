package in.venkat.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.venkat.service.ImageService;

@RestController
@RequestMapping("/save")
public class ImageController {
	@Autowired
	private ImageService imageService;
	@PostMapping("/image")
	public void saveImage(@RequestParam("image")MultipartFile image,@RequestParam("name") String name,@RequestParam("description") String description) throws IOException
	{
		imageService.saveImageToDB(image, name, description);
		
	}

}

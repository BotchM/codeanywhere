/**
 * 
 */
package meta.codeanywhere.test;

import meta.codeanywhere.filesystem.VirtualFileSystem;
import meta.codeanywhere.filesystem.file.VirtualBinaryFile;
import meta.codeanywhere.filesystem.file.VirtualFolder;

/**
 * @author Biao Zhang
 *
 */
public class TestHibernateFileSystem {
	public static void main(String[] arv) {
		VirtualFileSystem vfs = VirtualFileSystem.getInstance();
		/*VirtualFolder folder = vfs.openFolder("/");
		List<VirtualAbstractFile> subfs = folder.getSubFiles();
		for (VirtualAbstractFile f: subfs) {
			System.out.println(f.getPath());
		}*/
		//vfs.deleteFolder("/");
		
		VirtualFolder vf = vfs.createFolder("/home/talent");
		System.out.println(vf.getPath());
		VirtualBinaryFile vfile = vfs.openBinaryFile("/home/talent/video/player.conf");
		VirtualFolder vfolder = vfile.getParentFolder();
		System.out.println(vfolder.getPath());
		System.out.println(vfile.getName());
		//vfs.deleteFolder("/lib");
		
		/*VirtualFileDAO fileDAO = DAOFactory.DEFAULT.getVirtualFileDAO();
		VirtualFolderDAO folderDAO = DAOFactory.DEFAULT.getVirtualFolderDAO();
		
		VirtualFolder vfolder = folderDAO.getByPath("/lib/hibernate");
		List<VirtualFile> vfiles = fileDAO.getSubFiles(vfolder);
		
		for (VirtualFile file: vfiles) {
			DAOFactory.DEFAULT.getVirtualAbstractFileDAO().makeTransient(file);
			System.out.println(file.getName());
		}*/
		
		//VirtualFile file = vfs.openFile("/lib/hibernate/conf.ini", "conf.ini");
		//vfs.deleteFile("/lib/hibernate/conf.ini");
	}
}

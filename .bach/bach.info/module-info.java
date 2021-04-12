import com.github.sormuras.bach.ProjectInfo;
import com.github.sormuras.bach.ProjectInfo.Options;
import com.github.sormuras.bach.ProjectInfo.Tools;

@ProjectInfo(
  name = "app",
  options = @Options(
      tools = @Tools(limit = {"javac", "jar", "jlink"})
  )
)
module bach.info {
 requires com.github.sormuras.bach;
}

package alyya.git ;

def gitCommit(gitPath){
	return "/bin/git --git-dir=${gitPath} rev-parse HEAD".excute().text 
}



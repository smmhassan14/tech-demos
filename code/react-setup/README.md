# How to Run Your First React App

## Step 1: Check if Node.js and npm are installed
1. Open a terminal (Command Prompt, PowerShell, or your IDE’s terminal).  

2. Run the following command: `node -v` 
    -   If **installed**, you’ll see a version number (e.g., `v18.16.0`). 

    -   If **not installed** you will get an error like “node is not recognized as a command”.

 3. Repeat step 2 but for npm using `npm -v`
	 -   If **installed** you should see a version number (e.g., `9.5.1`).    

	 -   If **not installed** you will get an error like “npm is not recognized as a command”.

⚠️ **Note:** Skip to Step 3 if both are installed

## Step 2: Install Node.js and npm
1. Go to the official Node.js download page:  https://nodejs.org/

2. Select your operating system (Windows, macOS, or Linux) and download the installer for your operating system and run it. The installer includes npm by default.

3. Once finished, open a new terminal and run `node -v` and `npm -v` again to confirm installation.

## Step 3: Set up your dev environment
1. Open your terminal and run the following command: `npx create-react-app app-name` 
	  -   `npx` → runs the package without needing to install it globally.
	  -   `create-react-app` → sets up a new React project with all the configuration done for you.
	      
	  -   `app-name` → the name of your project folder (you can change this).
        
2. Move into the project folder: `cd my-app` 
    
	-   Start the development server: `npm start` 
	    
	-   Open your browser and go to [http://localhost:3000](http://localhost:3000).  
	    You should see the default React app running 🎉.

## Step 4: Explore the dev environment
Understanding the project structure is key to knowing where to write your code:

```
hello-world/
	├── node_modules/        # Project dependencies (auto-generated)
	├── public/              # Static files (including index.html)
	├── src/                 # Your React code lives here
	│   ├── App.js           # Main component
	│   ├── index.js         # Entry point that renders <App /> into index.html
	│   └── ...other files
	├── package.json         # Lists dependencies and project scripts
	└── README.md            # Project documentation
```

### Key files to know:

-   **`public/index.html`** → The single HTML file. React injects your app into the `<div id="root"></div>` here.
    
-   **`src/index.js`** → The entry point for the app. It tells React to render `<App />` into `index.html`.
    
-   **`src/App.js`** → Your first React component. This is where you can start editing UI.
    
👉 React apps are **component-based** — meaning you’ll build your app by creating and combining small, reusable components.

## Step 5: Code Hello World

1. Open the App.js file

	- Navigate to the `src` folder and open **`App.js`** in your code editor.  
This file contains the main component for your React app.

2. Change the default text

	- Find the code inside the `<p>` tag. For example, you might see something like this:

		```
		<p> 
			Edit <code>src/App.js</code> and save to reload. 
		</p>
		```

		Replace the text inside the `<p>` tag with your own message:

		`<p>Hello  World</p>` 

3. Save and see changes on the browser**

	-   Save the file (`Ctrl + S` / `Cmd + S`).
	    
	-   Go back to your browser (where `npm start` is running).
	    
	-   You’ll see your new message appear automatically without hard-refreshing. 🎉

### 🎉 Congratulations, you just ran your first React App! 🎉
